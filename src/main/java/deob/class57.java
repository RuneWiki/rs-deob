package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bl")
public class class57 extends class108 {

    @ObfuscatedName("bl.c")
    public AudioFormat field643;

    @ObfuscatedName("bl.i")
    public SourceDataLine field644;

    @ObfuscatedName("bl.o")
    public int field642;

    @ObfuscatedName("bl.j")
    public byte[] field645;

    @ObfuscatedName("bl.c(I)V")
    public void method726() {
        this.field643 = new AudioFormat((float) Statics.field3928, 16, Statics.field298 ? 2 : 1, true, false);
        this.field645 = new byte[0x100 << (Statics.field298 ? 2 : 1)];
    }

    @ObfuscatedName("bl.i(II)V")
    public void method729(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field643, arg0 << (Statics.field298 ? 2 : 1));
            this.field644 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field644.open();
            this.field644.start();
            this.field642 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field644 = null;
                throw var11;
            } else {
                this.method729(class200.method2857(arg0));
            }
        }
    }

    @ObfuscatedName("bl.o(I)I")
    public int method737() {
        return this.field642 - (this.field644.available() >> (Statics.field298 ? 2 : 1));
    }

    @ObfuscatedName("bl.j()V")
    public void method743() {
        int var1 = 256;
        if (Statics.field298) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1562[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field645[var2 * 2] = (byte) (var3 >> 8);
            this.field645[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field644.write(this.field645, 0, var1 << 1);
    }

    @ObfuscatedName("bl.k(I)V")
    public void method730() {
        if (this.field644 != null) {
            this.field644.close();
            this.field644 = null;
        }
    }

    @ObfuscatedName("bl.x(S)V")
    public void method728() {
        this.field644.flush();
    }
}
