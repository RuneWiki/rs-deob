package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bd")
public class class56 extends class110 {

    @ObfuscatedName("bd.a")
    public AudioFormat field666;

    @ObfuscatedName("bd.j")
    public SourceDataLine field665;

    @ObfuscatedName("bd.n")
    public int field664;

    @ObfuscatedName("bd.r")
    public byte[] field667;

    @ObfuscatedName("bd.a(B)V")
    public void method687() {
        this.field666 = new AudioFormat((float) Statics.field1552, 16, Statics.field1628 ? 2 : 1, true, false);
        this.field667 = new byte[0x100 << (Statics.field1628 ? 2 : 1)];
    }

    @ObfuscatedName("bd.j(II)V")
    public void method686(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field666, arg0 << (Statics.field1628 ? 2 : 1));
            this.field665 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field665.open();
            this.field665.start();
            this.field664 = arg0;
        } catch (LineUnavailableException var4) {
            if (class178.method647(arg0) == 1) {
                this.field665 = null;
                throw var4;
            } else {
                this.method686(class178.method2668(arg0));
            }
        }
    }

    @ObfuscatedName("bd.n(B)I")
    public int method689() {
        return this.field664 - (this.field665.available() >> (Statics.field1628 ? 2 : 1));
    }

    @ObfuscatedName("bd.r()V")
    public void method688() {
        int var1 = 256;
        if (Statics.field1628) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1623[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field667[var2 * 2] = (byte) (var3 >> 8);
            this.field667[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field665.write(this.field667, 0, var1 << 1);
    }

    @ObfuscatedName("bd.v(B)V")
    public void method684() {
        if (this.field665 != null) {
            this.field665.close();
            this.field665 = null;
        }
    }

    @ObfuscatedName("bd.e(I)V")
    public void method690() {
        this.field665.flush();
    }
}
