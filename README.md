# DependenciesClass


## Installation

Add the following to `build.gradle`

```
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {

    implementation 'com.github.sdoward:Redi:1.0'
       
}

```

## Usage


### Instantiation
```
Redi redi = new Redi()
```

Make sure to login

```
redi.login("Your name");
```


### Main functionality

The library allows students to set topics that they know or don't know...

```
redi.setEncapsulationAsKnown(true);
//or
redi.setEncapsulationAsKnown(false);
```

You are also able to set custom topics

```
redi.setCustomKnowledgeAsKnown("Constructors", true);
```

You are able to see the topics that you know..

```
redi.redi.printKnownKnowledge();
```


## Extra

What other methods are available for you to use?
