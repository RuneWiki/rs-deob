package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("al")
public final class class24 extends Canvas {

    @ObfuscatedName("al.ap")
    public Component field90;

    public class24(Component arg0) {
        this.field90 = arg0;
    }

    public final void update(Graphics arg0) {
        this.field90.update(arg0);
    }

    public final void paint(Graphics arg0) {
        this.field90.paint(arg0);
    }
}
