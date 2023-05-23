package ru.geekbrains.lesson1.sample;

import ru.geekbrains.lesson1.regular.Decorator;
import ru.geekbrains.lesson1.regular.OtherClass;

/**
 * javac -sourcepath ./java -d out java/ru/geekbrains/lesson1/sample/Main.java
 *
 * java -classpath ./out ru.geekbrains.lesson1.sample.Main
 *
 DOCKERFILE
 FROM bellsoft/liberica-openjdk-alpine:11.0.16
 COPY ./java ./src
 RUN mkdir ./out
 RUN javac -sourcepath ./src -d out src/ru/geekbrains/lesson1/sample/Main.java
 CMD java -classpath ./out ru.geekbrains.lesson1.sample.Main

 DOCKERFILE edited
 FROM bellsoft/liberica-openjdk-alpine:11.0.16 as BuildProject
 WORKDIR /app
 COPY ./java ./src
 RUN mkdir ./out
 RUN javac -sourcepath ./src -d out ./src/ru/geekbrains/lesson1/sample/Main.java

 FROM scratch as OutputFiles
 COPY --from=BuildProject /app/out /bin

 docker buildx build --output type=local,dest=. .

 DOCKERFILE v3

 FROM bellsoft/liberica-openjdk-alpine:11.0.16
 WORKDIR /app
 COPY ./bin .
 CMD java -classpath . ru.geekbrains.lesson1.sample.Main
 */

public class Main {
    public static void main(String[] args) {
        int result = OtherClass.add(2, 3);
        System.out.println(Decorator.decorate(result));

        result = OtherClass.sub(2, 3);
        System.out.println(Decorator.decorate(result));

        result = OtherClass.mul(2, 3);
        System.out.println(Decorator.decorate(result));

        result = OtherClass.div(2, 3);
        System.out.println(Decorator.decorate(result));

    }
}