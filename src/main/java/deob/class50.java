package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ax")
public class class50 extends class104 {

    @ObfuscatedName("ax.m")
    public AudioFormat field402;

    @ObfuscatedName("ax.f")
    public SourceDataLine field399;

    @ObfuscatedName("ax.q")
    public int field401;

    @ObfuscatedName("ax.w")
    public byte[] field400;

    @ObfuscatedName("ax.m(I)V")
    public void method734() {
        this.field402 = new AudioFormat((float) Statics.field3803, 16, Statics.field1370 ? 2 : 1, true, false);
        this.field400 = new byte[0x100 << (Statics.field1370 ? 2 : 1)];
    }

    @ObfuscatedName("ax.f(II)V")
    public void method735(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field402, arg0 << (Statics.field1370 ? 2 : 1));
            this.field399 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field399.open();
            this.field399.start();
            this.field401 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field399 = null;
                throw var11;
            } else {
                this.method735(class207.method1594(arg0));
            }
        }
    }

    @ObfuscatedName("ax.q(B)I")
    public int method747() {
        return this.field401 - (this.field399.available() >> (Statics.field1370 ? 2 : 1));
    }

    @ObfuscatedName("ax.w()V")
    public void method753() {
        int var1 = 256;
        if (Statics.field1370) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1365[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field400[var2 * 2] = (byte) (var3 >> 8);
            this.field400[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field399.write(this.field400, 0, var1 << 1);
    }

    @ObfuscatedName("ax.o(I)V")
    public void method733() {
        if (this.field399 != null) {
            this.field399.close();
            this.field399 = null;
        }
    }

    @ObfuscatedName("ax.u(I)V")
    public void method738() {
        this.field399.flush();
    }
}
