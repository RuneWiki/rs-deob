package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ag")
public class class45 extends class98 {

    @ObfuscatedName("ag.v")
    public AudioFormat field401;

    @ObfuscatedName("ag.s")
    public SourceDataLine field402;

    @ObfuscatedName("ag.o")
    public int field400;

    @ObfuscatedName("ag.k")
    public byte[] field403;

    @ObfuscatedName("ag.v(I)V")
    public void method670() {
        this.field401 = new AudioFormat((float) Statics.field66, 16, Statics.field1365 ? 2 : 1, true, false);
        this.field403 = new byte[0x100 << (Statics.field1365 ? 2 : 1)];
    }

    @ObfuscatedName("ag.s(II)V")
    public void method675(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field401, arg0 << (Statics.field1365 ? 2 : 1));
            this.field402 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field402.open();
            this.field402.start();
            this.field400 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field402 = null;
                throw var11;
            } else {
                this.method675(class190.method5134(arg0));
            }
        }
    }

    @ObfuscatedName("ag.o(I)I")
    public int method672() {
        return this.field400 - (this.field402.available() >> (Statics.field1365 ? 2 : 1));
    }

    @ObfuscatedName("ag.k()V")
    public void method669() {
        int var1 = 256;
        if (Statics.field1365) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1347[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field403[var2 * 2] = (byte) (var3 >> 8);
            this.field403[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field402.write(this.field403, 0, var1 << 1);
    }

    @ObfuscatedName("ag.u(I)V")
    public void method674() {
        if (this.field402 != null) {
            this.field402.close();
            this.field402 = null;
        }
    }

    @ObfuscatedName("ag.i(I)V")
    public void method684() {
        this.field402.flush();
    }
}
