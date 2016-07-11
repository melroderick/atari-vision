package edu.brown.cs.atari_vision.ale.gui;

import burlap.mdp.core.state.State;
import burlap.visualizer.StatePainter;
import burlap.visualizer.StateRenderLayer;
import burlap.visualizer.Visualizer;
import edu.brown.cs.atari_vision.ale.burlap.ALEState;
import edu.brown.cs.atari_vision.ale.screen.ScreenConverter;

import java.awt.*;

/**
 * Created by maroderi on 7/11/16.
 */
public class ALEVisualizer extends Visualizer {

    public ALEVisualizer() {
        super();

        addStatePainter(new ALEStatePainter());
    }

    class ALEStatePainter implements StatePainter {

        ScreenConverter screenConverter = new ScreenConverter();

        @Override
        public void paint(Graphics2D g2, State s, float cWidth, float cHeight) {
            g2.drawImage(screenConverter.convert(((ALEState) s).getScreen()), 0, 0, (int)cWidth, (int)cHeight, null);
        }
    }
}
