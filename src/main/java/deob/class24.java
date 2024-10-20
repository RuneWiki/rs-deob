package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("ad")
public final class class24 extends Canvas {

    @ObfuscatedName("ad.af")
    public Component field125;

    public class24(Component arg0) {
        this.field125 = arg0;
    }

    public final void update(Graphics arg0) {
        this.field125.update(arg0);
    }

    public final void paint(Graphics arg0) {
        this.field125.paint(arg0);
    }
}
