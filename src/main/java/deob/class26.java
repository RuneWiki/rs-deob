package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("v")
public class class26 extends class44 {

    @ObfuscatedName("v.a")
    public AudioFormat field134;

    @ObfuscatedName("v.f")
    public SourceDataLine field132;

    @ObfuscatedName("v.c")
    public int field133;

    @ObfuscatedName("v.x")
    public byte[] field131;

    @ObfuscatedName("v.a(I)V")
    public void method336() {
        this.field134 = new AudioFormat((float) Statics.field338, 16, Statics.field1745 ? 2 : 1, true, false);
        this.field131 = new byte[0x100 << (Statics.field1745 ? 2 : 1)];
    }

    @ObfuscatedName("v.f(IB)V")
    public void method328(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field134, arg0 << (Statics.field1745 ? 2 : 1));
            this.field132 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field132.open();
            this.field132.start();
            this.field133 = arg0;
        } catch (LineUnavailableException var4) {
            if (class282.method4107(arg0) == 1) {
                this.field132 = null;
                throw var4;
            } else {
                this.method328(class282.method707(arg0));
            }
        }
    }

    @ObfuscatedName("v.c(I)I")
    public int method333() {
        return this.field133 - (this.field132.available() >> (Statics.field1745 ? 2 : 1));
    }

    @ObfuscatedName("v.x()V")
    public void method329() {
        int var1 = 256;
        if (Statics.field1745) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field299[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field131[var2 * 2] = (byte) (var3 >> 8);
            this.field131[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field132.write(this.field131, 0, var1 << 1);
    }

    @ObfuscatedName("v.h(I)V")
    public void method330() {
        if (this.field132 != null) {
            this.field132.close();
            this.field132 = null;
        }
    }

    @ObfuscatedName("v.j(B)V")
    public void method331() {
        this.field132.flush();
    }
}
