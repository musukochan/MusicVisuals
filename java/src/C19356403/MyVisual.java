package C19356403;

import ie.tudublin.*;

public class MyVisual extends Visual
{    
    WaveForm wf;
    AudioBandsVisual abv;
    boolean triangle = false;
    Fractal tr;
    int numCubes;
    CUBE[] cubes;
    float angle = 0;
    float strength = 0.10f;


    public void settings()
    {
        size(800, 600, P3D);
        //fullScreen(P3D, SPAN);
        
        // Use this to make fullscreen
        //fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        //fullScreen(P3D, SPAN); 
    }

    public void setup()
    {
        surface.setLocation(957, 0);
        rectMode(CENTER);
        stroke(0,15,30);
        strokeWeight(25);
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("MAX (deltaMAX).mp3");

        numCubes = (int)(7 + getSpecSize() * strength); // calculates the number of cubes to be spawned
        cubes = new CUBE[numCubes];



        for(int i = 0; i < numCubes; i++) //  makes cubes
        {
            cubes[i] = new CUBE(this);
        }

        tr = new Fractal(this);

        
        // Call this instead to read audio from the microphone
        //startListening();
        
        wf = new WaveForm(this);
        abv = new AudioBandsVisual(this);
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
    }

    public void draw()
    {
        background(0);
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();

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

        //abv.render();


    }
}
