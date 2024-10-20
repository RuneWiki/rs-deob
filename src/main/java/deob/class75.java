package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("bc")
public final class class75 extends Canvas {

    @ObfuscatedName("bc.u")
    public Component field1358;

    public class75(Component arg0) {
        this.field1358 = arg0;
    }

    public final void update(Graphics arg0) {
        this.field1358.update(arg0);
    }

    public final void paint(Graphics arg0) {
        this.field1358.paint(arg0);
    }
}
