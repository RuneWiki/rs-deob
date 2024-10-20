package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("au")
public class class45 extends class96 {

    @ObfuscatedName("au.w")
    public AudioFormat field364;

    @ObfuscatedName("au.m")
    public SourceDataLine field365;

    @ObfuscatedName("au.q")
    public int field366;

    @ObfuscatedName("au.b")
    public byte[] field367;

    @ObfuscatedName("au.w(I)V")
    public void method702() {
        this.field364 = new AudioFormat((float) Statics.field1331, 16, Statics.field1322 ? 2 : 1, true, false);
        this.field367 = new byte[0x100 << (Statics.field1322 ? 2 : 1)];
    }

    @ObfuscatedName("au.m(IB)V")
    public void method701(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field364, arg0 << (Statics.field1322 ? 2 : 1));
            this.field365 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field365.open();
            this.field365.start();
            this.field366 = arg0;
        } catch (LineUnavailableException var4) {
            if (class188.method2504(arg0) == 1) {
                this.field365 = null;
                throw var4;
            } else {
                this.method701(class188.method1781(arg0));
            }
        }
    }

    @ObfuscatedName("au.q(I)I")
    public int method704() {
        return this.field366 - (this.field365.available() >> (Statics.field1322 ? 2 : 1));
    }

    @ObfuscatedName("au.x()V")
    public void method722() {
        int var1 = 256;
        if (Statics.field1322) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1328[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field367[var2 * 2] = (byte) (var3 >> 8);
            this.field367[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field365.write(this.field367, 0, var1 << 1);
    }

    @ObfuscatedName("au.j(B)V")
    public void method706() {
        if (this.field365 != null) {
            this.field365.close();
            this.field365 = null;
        }
    }

    @ObfuscatedName("au.a(I)V")
    public void method707() {
        this.field365.flush();
    }
}
