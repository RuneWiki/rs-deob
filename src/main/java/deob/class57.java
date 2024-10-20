package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bp")
public class class57 extends class108 {

    @ObfuscatedName("bp.o")
    public AudioFormat field664;

    @ObfuscatedName("bp.k")
    public SourceDataLine field663;

    @ObfuscatedName("bp.t")
    public int field665;

    @ObfuscatedName("bp.d")
    public byte[] field666;

    @ObfuscatedName("bp.o(I)V")
    public void method726() {
        this.field664 = new AudioFormat((float) Statics.field1582, 16, Statics.field1567 ? 2 : 1, true, false);
        this.field666 = new byte[0x100 << (Statics.field1567 ? 2 : 1)];
    }

    @ObfuscatedName("bp.k(II)V")
    public void method733(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field664, arg0 << (Statics.field1567 ? 2 : 1));
            this.field663 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field663.open();
            this.field663.start();
            this.field665 = arg0;
        } catch (LineUnavailableException var4) {
            if (class200.method4142(arg0) == 1) {
                this.field663 = null;
                throw var4;
            } else {
                this.method733(class200.method1706(arg0));
            }
        }
    }

    @ObfuscatedName("bp.t(I)I")
    public int method728() {
        return this.field665 - (this.field663.available() >> (Statics.field1567 ? 2 : 1));
    }

    @ObfuscatedName("bp.d()V")
    public void method729() {
        int var1 = 256;
        if (Statics.field1567) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1566[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field666[var2 * 2] = (byte) (var3 >> 8);
            this.field666[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field663.write(this.field666, 0, var1 << 1);
    }

    @ObfuscatedName("bp.h(I)V")
    public void method730() {
        if (this.field663 != null) {
            this.field663.close();
            this.field663 = null;
        }
    }

    @ObfuscatedName("bp.m(B)V")
    public void method731() {
        this.field663.flush();
    }
}
