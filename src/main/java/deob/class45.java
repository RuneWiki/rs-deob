package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ao")
public class class45 extends class98 {

    @ObfuscatedName("ao.y")
    public AudioFormat field405;

    @ObfuscatedName("ao.c")
    public SourceDataLine field403;

    @ObfuscatedName("ao.n")
    public int field404;

    @ObfuscatedName("ao.u")
    public byte[] field402;

    @ObfuscatedName("ao.y(I)V")
    public void method672() {
        this.field405 = new AudioFormat((float) Statics.field56, 16, Statics.field1359 ? 2 : 1, true, false);
        this.field402 = new byte[0x100 << (Statics.field1359 ? 2 : 1)];
    }

    @ObfuscatedName("ao.c(II)V")
    public void method673(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field405, arg0 << (Statics.field1359 ? 2 : 1));
            this.field403 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field403.open();
            this.field403.start();
            this.field404 = arg0;
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
                this.method673(class190.method2844(arg0));
            }
        }
    }

    @ObfuscatedName("ao.n(I)I")
    public int method674() {
        return this.field404 - (this.field403.available() >> (Statics.field1359 ? 2 : 1));
    }

    @ObfuscatedName("ao.u()V")
    public void method680() {
        int var1 = 256;
        if (Statics.field1359) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1353[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field402[var2 * 2] = (byte) (var3 >> 8);
            this.field402[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field403.write(this.field402, 0, var1 << 1);
    }

    @ObfuscatedName("ao.i(I)V")
    public void method676() {
        if (this.field403 != null) {
            this.field403.close();
            this.field403 = null;
        }
    }

    @ObfuscatedName("ao.p(I)V")
    public void method679() {
        this.field403.flush();
    }
}
