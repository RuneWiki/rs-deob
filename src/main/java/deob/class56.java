package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bf")
public class class56 extends class107 {

    @ObfuscatedName("bf.b")
    public AudioFormat field610;

    @ObfuscatedName("bf.q")
    public SourceDataLine field609;

    @ObfuscatedName("bf.o")
    public int field611;

    @ObfuscatedName("bf.p")
    public byte[] field612;

    @ObfuscatedName("bf.b(I)V")
    public void method730() {
        this.field610 = new AudioFormat((float) Statics.field1523, 16, Statics.field2013 ? 2 : 1, true, false);
        this.field612 = new byte[0x100 << (Statics.field2013 ? 2 : 1)];
    }

    @ObfuscatedName("bf.q(IB)V")
    public void method715(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field610, arg0 << (Statics.field2013 ? 2 : 1));
            this.field609 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field609.open();
            this.field609.start();
            this.field611 = arg0;
        } catch (LineUnavailableException var4) {
            if (class198.method571(arg0) == 1) {
                this.field609 = null;
                throw var4;
            } else {
                this.method715(class198.method2924(arg0));
            }
        }
    }

    @ObfuscatedName("bf.o(I)I")
    public int method716() {
        return this.field611 - (this.field609.available() >> (Statics.field2013 ? 2 : 1));
    }

    @ObfuscatedName("bf.p()V")
    public void method735() {
        int var1 = 256;
        if (Statics.field2013) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1514[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field612[var2 * 2] = (byte) (var3 >> 8);
            this.field612[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field609.write(this.field612, 0, var1 << 1);
    }

    @ObfuscatedName("bf.a(I)V")
    public void method718() {
        if (this.field609 != null) {
            this.field609.close();
            this.field609 = null;
        }
    }

    @ObfuscatedName("bf.h(S)V")
    public void method719() {
        this.field609.flush();
    }
}
