package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bz")
public class class64 extends class51 {

    @ObfuscatedName("bz.f")
    public AudioFormat field1202;

    @ObfuscatedName("bz.k")
    public SourceDataLine field1201;

    @ObfuscatedName("bz.al")
    public int field1199;

    @ObfuscatedName("bz.aw")
    public byte[] field1200;

    @ObfuscatedName("bz.f(Ljava/awt/Component;)V")
    public void method975(Component arg0) {
        this.field1202 = new AudioFormat((float) Statics.field1105, 16, Statics.field1097 ? 2 : 1, true, false);
        this.field1200 = new byte[0x100 << (Statics.field1097 ? 2 : 1)];
    }

    @ObfuscatedName("bz.k(I)V")
    public void method976(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1202, arg0 << (Statics.field1097 ? 2 : 1));
            this.field1201 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1201.open();
            this.field1201.start();
            this.field1199 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1201 = null;
                throw var11;
            } else {
                this.method976(class115.method149(arg0));
            }
        }
    }

    @ObfuscatedName("bz.y()I")
    public int method986() {
        return this.field1199 - (this.field1201.available() >> (Statics.field1097 ? 2 : 1));
    }

    @ObfuscatedName("bz.e()V")
    public void method978() {
        int var1 = 256;
        if (Statics.field1097) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1108[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1200[var2 * 2] = (byte) (var3 >> 8);
            this.field1200[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1201.write(this.field1200, 0, var1 << 1);
    }

    @ObfuscatedName("bz.r()V")
    public void method974() {
        if (this.field1201 != null) {
            this.field1201.close();
            this.field1201 = null;
        }
    }

    @ObfuscatedName("bz.a()V")
    public void method980() {
        this.field1201.flush();
    }
}
