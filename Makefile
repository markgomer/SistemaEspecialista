build:
	mkdir -p build
	javac -d build src/Main.java src/util/*.java src/model/*.java src/algoritmos/*.java
	cp -r dados build/

jar: build
	jar cfe SistemaEspecialista.jar Main -C build .

run:
	cd build && java Main

run-jar: jar
	java -jar SistemaEspecialista.jar

build-run: build run
