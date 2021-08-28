# Music Visualiser Project

Name: Mihai Alexandru Samson

Student Number: C19356403

## Instructions
- Fork this repository and use it a starter project for your assignment
- Create a new package named your student number and put all your code in this package.
- You should start by creating a subclass of ie.tudublin.Visual
- There is an example visualiser called MyVisual in the example package
- Check out the WaveForm and AudioBandsVisual for examples of how to call the Processing functions from other classes that are not subclasses of PApplet

# Description of the assignment
Music visualiser using Processing libraries in Java.

# Instructions

# How it works
There are multiple classes which get called in MyVisual in order to combine the visuals together into one plane. The visual classes I created were CUBE, Fractal and WaveForm. 


CUBE example: The first line creates the spawn point of the cube based on the X,Y, and Z coordinates which are calculated in the CUBE function. The rotation is calculated using the amplitude which is calculated based on the speed of the song. 
```Java
        c.translate(CubeX, CubeY, CubeZ);

        sumX += c.getAmplitude() * (rotateX / 2);
        sumY += c.getAmplitude() * (rotateY / 2);
        sumZ += c.getAmplitude() * (rotateZ / 2);

        c.rotateX(sumX); // rotates cubes
        c.rotateY(sumY);
        c.rotateZ(sumZ);
```

The draw function inside MYVisual which creates the visuals. The for loop calls the cube objects, the number of cubes is calculated in the setup(). I used the translate in order to position the visuals in the frame properly. The wf.render calls the wave form render function from the wave form class and the tr.render is a function from the fractal class.
```Java
	 for(int i = 0; i < numCubes; i++) // calls cube object
            {
                cubes[i].display();
            }

        translate (400,-100,0);

        wf.render();


        translate (100,599,0);
        wf.render2();

        translate (-500,-493,-250);
        tr.render();
```

```Java





```



# What I am most proud of in the assignment
I am most proud in this assignment by finding this colour scheme and using multiple wave forms to create an effect on the top and bottom which form my perspective look like sets of teeth and makes it feel like I am travelling through a tunnel. I like how the visualiser looks overall since I feel like everything fits together well. 

This is a youtube video showcasing my visualiser: [![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://youtu.be/xcCPZlk1nxE)
# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

