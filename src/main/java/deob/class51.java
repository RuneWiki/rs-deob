package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("af")
public class class51 extends class106 {

    @ObfuscatedName("af.z")
    public AudioFormat field404;

    @ObfuscatedName("af.n")
    public SourceDataLine field403;

    @ObfuscatedName("af.v")
    public int field402;

    @ObfuscatedName("af.u")
    public byte[] field405;

    @ObfuscatedName("af.z(B)V")
    public void method739() {
        this.field404 = new AudioFormat((float) Statics.field1930, 16, Statics.field1385 ? 2 : 1, true, false);
        this.field405 = new byte[0x100 << (Statics.field1385 ? 2 : 1)];
    }

    @ObfuscatedName("af.n(IS)V")
    public void method740(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field404, arg0 << (Statics.field1385 ? 2 : 1));
            this.field403 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field403.open();
            this.field403.start();
            this.field402 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field403 = null;
                throw var11;
            } else {
                this.method740(class189.method4527(arg0));
            }
        }
    }

    @ObfuscatedName("af.v(B)I")
    public int method749() {
        return this.field402 - (this.field403.available() >> (Statics.field1385 ? 2 : 1));
    }

    @ObfuscatedName("af.u()V")
    public void method742() {
        int var1 = 256;
        if (Statics.field1385) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1387[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field405[var2 * 2] = (byte) (var3 >> 8);
            this.field405[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field403.write(this.field405, 0, var1 << 1);
    }

    @ObfuscatedName("af.r(I)V")
    public void method743() {
        if (this.field403 != null) {
            this.field403.close();
            this.field403 = null;
        }
    }

    @ObfuscatedName("af.p(I)V")
    public void method744() {
        this.field403.flush();
    }
}
