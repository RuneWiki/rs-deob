package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("by")
public class class70 extends class57 {

    @ObfuscatedName("by.v")
    public AudioFormat field1281;

    @ObfuscatedName("by.f")
    public SourceDataLine field1282;

    @ObfuscatedName("by.af")
    public int field1283;

    @ObfuscatedName("by.au")
    public byte[] field1284;

    @ObfuscatedName("by.v(Ljava/awt/Component;)V")
    public void method1088(Component arg0) {
        this.field1281 = new AudioFormat((float) Statics.field1170, 16, Statics.field1171 ? 2 : 1, true, false);
        this.field1284 = new byte[0x100 << (Statics.field1171 ? 2 : 1)];
    }

    @ObfuscatedName("by.f(I)V")
    public void method1108(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1281, arg0 << (Statics.field1171 ? 2 : 1));
            this.field1282 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1282.open();
            this.field1282.start();
            this.field1283 = arg0;
        } catch (LineUnavailableException var4) {
            if (class126.method736(arg0) == 1) {
                this.field1282 = null;
                throw var4;
            } else {
                this.method1108(class126.method744(arg0));
            }
        }
    }

    @ObfuscatedName("by.i()I")
    public int method1100() {
        return this.field1283 - (this.field1282.available() >> (Statics.field1171 ? 2 : 1));
    }

    @ObfuscatedName("by.d()V")
    public void method1091() {
        int var1 = 256;
        if (Statics.field1171) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1185[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1284[var2 * 2] = (byte) (var3 >> 8);
            this.field1284[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1282.write(this.field1284, 0, var1 << 1);
    }

    @ObfuscatedName("by.o()V")
    public void method1092() {
        if (this.field1282 != null) {
            this.field1282.close();
            this.field1282 = null;
        }
    }

    @ObfuscatedName("by.c()V")
    public void method1096() {
        this.field1282.flush();
    }
}
