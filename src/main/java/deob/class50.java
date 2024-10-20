package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ak")
public class class50 extends class51 {

    @ObfuscatedName("ak.c")
    public AudioFormat field1073;

    @ObfuscatedName("ak.j")
    public SourceDataLine field1074;

    @ObfuscatedName("ak.f")
    public int field1072;

    @ObfuscatedName("ak.y")
    public byte[] field1075;

    @ObfuscatedName("ak.c(Ljava/awt/Component;)V")
    public void method885(Component arg0) {
        this.field1073 = new AudioFormat((float) Statics.field1090, 16, Statics.field1077 ? 2 : 1, true, false);
        this.field1075 = new byte[0x100 << (Statics.field1077 ? 2 : 1)];
    }

    @ObfuscatedName("ak.j(I)V")
    public void method886(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1073, arg0 << (Statics.field1077 ? 2 : 1));
            this.field1074 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1074.open();
            this.field1074.start();
            this.field1072 = arg0;
        } catch (LineUnavailableException var11) {
            if (class123.method847(arg0) == 1) {
                this.field1074 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method886(var10);
        }
    }

    @ObfuscatedName("ak.f()I")
    public int method888() {
        return this.field1072 - (this.field1074.available() >> (Statics.field1077 ? 2 : 1));
    }

    @ObfuscatedName("ak.y()V")
    public void method902() {
        int var1 = 256;
        if (Statics.field1077) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1091[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1075[var2 * 2] = (byte) (var3 >> 8);
            this.field1075[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1074.write(this.field1075, 0, var1 << 1);
    }

    @ObfuscatedName("ak.x()V")
    public void method889() {
        if (this.field1074 != null) {
            this.field1074.close();
            this.field1074 = null;
        }
    }

    @ObfuscatedName("ak.e()V")
    public void method890() {
        this.field1074.flush();
    }
}
