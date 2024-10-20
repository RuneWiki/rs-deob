package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("aw")
public class class51 extends class106 {

    @ObfuscatedName("aw.s")
    public AudioFormat field402;

    @ObfuscatedName("aw.j")
    public SourceDataLine field403;

    @ObfuscatedName("aw.i")
    public int field401;

    @ObfuscatedName("aw.k")
    public byte[] field400;

    @ObfuscatedName("aw.s(B)V")
    public void method700() {
        this.field402 = new AudioFormat((float) Statics.field1384, 16, Statics.field1381 ? 2 : 1, true, false);
        this.field400 = new byte[0x100 << (Statics.field1381 ? 2 : 1)];
    }

    @ObfuscatedName("aw.j(II)V")
    public void method706(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field402, arg0 << (Statics.field1381 ? 2 : 1));
            this.field403 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field403.open();
            this.field403.start();
            this.field401 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field403 = null;
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

    @ObfuscatedName("aw.i(I)I")
    public int method692() {
        return this.field401 - (this.field403.available() >> (Statics.field1381 ? 2 : 1));
    }

    @ObfuscatedName("aw.k()V")
    public void method693() {
        int var1 = 256;
        if (Statics.field1381) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1391[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field400[var2 * 2] = (byte) (var3 >> 8);
            this.field400[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field403.write(this.field400, 0, var1 << 1);
    }

    @ObfuscatedName("aw.u(I)V")
    public void method694() {
        if (this.field403 != null) {
            this.field403.close();
            this.field403 = null;
        }
    }

    @ObfuscatedName("aw.n(I)V")
    public void method695() {
        this.field403.flush();
    }
}
