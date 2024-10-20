package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bj")
public class class56 extends class110 {

    @ObfuscatedName("bj.n")
    public AudioFormat field664;

    @ObfuscatedName("bj.p")
    public SourceDataLine field662;

    @ObfuscatedName("bj.i")
    public int field665;

    @ObfuscatedName("bj.j")
    public byte[] field663;

    @ObfuscatedName("bj.n(I)V")
    public void method708() {
        this.field664 = new AudioFormat((float) Statics.field1634, 16, Statics.field1631 ? 2 : 1, true, false);
        this.field663 = new byte[0x100 << (Statics.field1631 ? 2 : 1)];
    }

    @ObfuscatedName("bj.p(II)V")
    public void method691(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field664, arg0 << (Statics.field1631 ? 2 : 1));
            this.field662 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field662.open();
            this.field662.start();
            this.field665 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field662 = null;
                throw var11;
            } else {
                this.method691(class178.method76(arg0));
            }
        }
    }

    @ObfuscatedName("bj.i(B)I")
    public int method689() {
        return this.field665 - (this.field662.available() >> (Statics.field1631 ? 2 : 1));
    }

    @ObfuscatedName("bj.j()V")
    public void method690() {
        int var1 = 256;
        if (Statics.field1631) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1637[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field663[var2 * 2] = (byte) (var3 >> 8);
            this.field663[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field662.write(this.field663, 0, var1 << 1);
    }

    @ObfuscatedName("bj.f(I)V")
    public void method694() {
        if (this.field662 != null) {
            this.field662.close();
            this.field662 = null;
        }
    }

    @ObfuscatedName("bj.m(I)V")
    public void method695() {
        this.field662.flush();
    }
}
