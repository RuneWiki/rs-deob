package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("at")
public class class42 extends class53 {

    @ObfuscatedName("at.v")
    public AudioFormat field309;

    @ObfuscatedName("at.n")
    public SourceDataLine field310;

    @ObfuscatedName("at.f")
    public int field311;

    @ObfuscatedName("at.y")
    public byte[] field312;

    @ObfuscatedName("at.v(B)V")
    public void method298() {
        this.field309 = new AudioFormat((float) Statics.field429, 16, Statics.field417 ? 2 : 1, true, false);
        this.field312 = new byte[0x100 << (Statics.field417 ? 2 : 1)];
    }

    @ObfuscatedName("at.n(IS)V")
    public void method299(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field309, arg0 << (Statics.field417 ? 2 : 1));
            this.field310 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field310.open();
            this.field310.start();
            this.field311 = arg0;
        } catch (LineUnavailableException var4) {
            if (class231.method2908(arg0) == 1) {
                this.field310 = null;
                throw var4;
            } else {
                this.method299(class231.method1933(arg0));
            }
        }
    }

    @ObfuscatedName("at.f(B)I")
    public int method316() {
        return this.field311 - (this.field310.available() >> (Statics.field417 ? 2 : 1));
    }

    @ObfuscatedName("at.y()V")
    public void method301() {
        int var1 = 256;
        if (Statics.field417) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field421[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field312[var2 * 2] = (byte) (var3 >> 8);
            this.field312[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field310.write(this.field312, 0, var1 << 1);
    }

    @ObfuscatedName("at.p(S)V")
    public void method302() {
        if (this.field310 != null) {
            this.field310.close();
            this.field310 = null;
        }
    }

    @ObfuscatedName("at.j(I)V")
    public void method303() {
        this.field310.flush();
    }
}
