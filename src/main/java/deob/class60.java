package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bn")
public class class60 extends class115 {

    @ObfuscatedName("bn.f")
    public AudioFormat field450;

    @ObfuscatedName("bn.b")
    public SourceDataLine field449;

    @ObfuscatedName("bn.l")
    public int field451;

    @ObfuscatedName("bn.m")
    public byte[] field452;

    @ObfuscatedName("bn.f(I)V")
    public void method807() {
        this.field450 = new AudioFormat((float) Statics.field1443, 16, Statics.field1434 ? 2 : 1, true, false);
        this.field452 = new byte[0x100 << (Statics.field1434 ? 2 : 1)];
    }

    @ObfuscatedName("bn.b(IB)V")
    public void method802(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field450, arg0 << (Statics.field1434 ? 2 : 1));
            this.field449 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field449.open();
            this.field449.start();
            this.field451 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field449 = null;
                throw var11;
            } else {
                this.method802(class198.method234(arg0));
            }
        }
    }

    @ObfuscatedName("bn.l(I)I")
    public int method801() {
        return this.field451 - (this.field449.available() >> (Statics.field1434 ? 2 : 1));
    }

    @ObfuscatedName("bn.m()V")
    public void method806() {
        int var1 = 256;
        if (Statics.field1434) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1435[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field452[var2 * 2] = (byte) (var3 >> 8);
            this.field452[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field449.write(this.field452, 0, var1 << 1);
    }

    @ObfuscatedName("bn.z(B)V")
    public void method804() {
        if (this.field449 != null) {
            this.field449.close();
            this.field449 = null;
        }
    }

    @ObfuscatedName("bn.q(I)V")
    public void method805() {
        this.field449.flush();
    }
}
