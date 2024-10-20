package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("aw")
public class class51 extends class106 {

    @ObfuscatedName("aw.c")
    public AudioFormat field404;

    @ObfuscatedName("aw.x")
    public SourceDataLine field402;

    @ObfuscatedName("aw.t")
    public int field403;

    @ObfuscatedName("aw.g")
    public byte[] field405;

    @ObfuscatedName("aw.c(I)V")
    public void method705() {
        this.field404 = new AudioFormat((float) Statics.field29, 16, Statics.field1385 ? 2 : 1, true, false);
        this.field405 = new byte[0x100 << (Statics.field1385 ? 2 : 1)];
    }

    @ObfuscatedName("aw.x(IB)V")
    public void method706(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field404, arg0 << (Statics.field1385 ? 2 : 1));
            this.field402 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field402.open();
            this.field402.start();
            this.field403 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field402 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method706(var17);
        }
    }

    @ObfuscatedName("aw.t(I)I")
    public int method707() {
        return this.field403 - (this.field402.available() >> (Statics.field1385 ? 2 : 1));
    }

    @ObfuscatedName("aw.g()V")
    public void method718() {
        int var1 = 256;
        if (Statics.field1385) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1373[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field405[var2 * 2] = (byte) (var3 >> 8);
            this.field405[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field402.write(this.field405, 0, var1 << 1);
    }

    @ObfuscatedName("aw.l(I)V")
    public void method709() {
        if (this.field402 != null) {
            this.field402.close();
            this.field402 = null;
        }
    }

    @ObfuscatedName("aw.u(I)V")
    public void method710() {
        this.field402.flush();
    }
}
