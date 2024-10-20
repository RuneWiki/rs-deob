package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bf")
public class class56 extends class110 {

    @ObfuscatedName("bf.i")
    public AudioFormat field672;

    @ObfuscatedName("bf.h")
    public SourceDataLine field670;

    @ObfuscatedName("bf.u")
    public int field671;

    @ObfuscatedName("bf.q")
    public byte[] field673;

    @ObfuscatedName("bf.i(I)V")
    public void method712() {
        this.field672 = new AudioFormat((float) Statics.field1629, 16, Statics.field2316 ? 2 : 1, true, false);
        this.field673 = new byte[0x100 << (Statics.field2316 ? 2 : 1)];
    }

    @ObfuscatedName("bf.h(II)V")
    public void method702(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field672, arg0 << (Statics.field2316 ? 2 : 1));
            this.field670 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field670.open();
            this.field670.start();
            this.field671 = arg0;
        } catch (LineUnavailableException var4) {
            if (class178.method117(arg0) == 1) {
                this.field670 = null;
                throw var4;
            } else {
                this.method702(class178.method1740(arg0));
            }
        }
    }

    @ObfuscatedName("bf.u(B)I")
    public int method703() {
        return this.field671 - (this.field670.available() >> (Statics.field2316 ? 2 : 1));
    }

    @ObfuscatedName("bf.q()V")
    public void method708() {
        int var1 = 256;
        if (Statics.field2316) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1626[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field673[var2 * 2] = (byte) (var3 >> 8);
            this.field673[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field670.write(this.field673, 0, var1 << 1);
    }

    @ObfuscatedName("bf.g(I)V")
    public void method705() {
        if (this.field670 != null) {
            this.field670.close();
            this.field670 = null;
        }
    }

    @ObfuscatedName("bf.v(I)V")
    public void method706() {
        this.field670.flush();
    }
}
