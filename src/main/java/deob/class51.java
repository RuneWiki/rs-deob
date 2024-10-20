package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("af")
public class class51 extends class106 {

    @ObfuscatedName("af.q")
    public AudioFormat field433;

    @ObfuscatedName("af.w")
    public SourceDataLine field430;

    @ObfuscatedName("af.e")
    public int field431;

    @ObfuscatedName("af.p")
    public byte[] field432;

    @ObfuscatedName("af.q(I)V")
    public void method685() {
        this.field433 = new AudioFormat((float) Statics.field2079, 16, Statics.field2054 ? 2 : 1, true, false);
        this.field432 = new byte[0x100 << (Statics.field2054 ? 2 : 1)];
    }

    @ObfuscatedName("af.w(IB)V")
    public void method686(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field433, arg0 << (Statics.field2054 ? 2 : 1));
            this.field430 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field430.open();
            this.field430.start();
            this.field431 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field430 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method686(var17);
        }
    }

    @ObfuscatedName("af.e(B)I")
    public int method687() {
        return this.field431 - (this.field430.available() >> (Statics.field2054 ? 2 : 1));
    }

    @ObfuscatedName("af.p()V")
    public void method688() {
        int var1 = 256;
        if (Statics.field2054) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1416[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field432[var2 * 2] = (byte) (var3 >> 8);
            this.field432[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field430.write(this.field432, 0, var1 << 1);
    }

    @ObfuscatedName("af.k(B)V")
    public void method689() {
        if (this.field430 != null) {
            this.field430.close();
            this.field430 = null;
        }
    }

    @ObfuscatedName("af.l(I)V")
    public void method693() {
        this.field430.flush();
    }
}
