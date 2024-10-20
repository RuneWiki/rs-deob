package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bh")
public class class56 extends class110 {

    @ObfuscatedName("bh.e")
    public AudioFormat field678;

    @ObfuscatedName("bh.o")
    public SourceDataLine field680;

    @ObfuscatedName("bh.m")
    public int field679;

    @ObfuscatedName("bh.g")
    public byte[] field677;

    @ObfuscatedName("bh.e(I)V")
    public void method699() {
        this.field678 = new AudioFormat((float) Statics.field1644, 16, Statics.field2050 ? 2 : 1, true, false);
        this.field677 = new byte[0x100 << (Statics.field2050 ? 2 : 1)];
    }

    @ObfuscatedName("bh.o(II)V")
    public void method704(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field678, arg0 << (Statics.field2050 ? 2 : 1));
            this.field680 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field680.open();
            this.field680.start();
            this.field679 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field680 = null;
                throw var11;
            } else {
                this.method704(class178.method2666(arg0));
            }
        }
    }

    @ObfuscatedName("bh.m(B)I")
    public int method690() {
        return this.field679 - (this.field680.available() >> (Statics.field2050 ? 2 : 1));
    }

    @ObfuscatedName("bh.g()V")
    public void method691() {
        int var1 = 256;
        if (Statics.field2050) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1630[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field677[var2 * 2] = (byte) (var3 >> 8);
            this.field677[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field680.write(this.field677, 0, var1 << 1);
    }

    @ObfuscatedName("bh.d(I)V")
    public void method692() {
        if (this.field680 != null) {
            this.field680.close();
            this.field680 = null;
        }
    }

    @ObfuscatedName("bh.b(I)V")
    public void method693() {
        this.field680.flush();
    }
}
