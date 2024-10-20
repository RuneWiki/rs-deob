package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("e")
public final class class24 extends Canvas {

    @ObfuscatedName("e.f")
    public Component field134;

    public class24(Component arg0) {
        this.field134 = arg0;
    }

    public final void update(Graphics arg0) {
        this.field134.update(arg0);
    }

    public final void paint(Graphics arg0) {
        this.field134.paint(arg0);
    }
}
