package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("al")
public class class25 extends class43 {

    @ObfuscatedName("al.am")
    public AudioFormat field123;

    @ObfuscatedName("al.ap")
    public SourceDataLine field122;

    @ObfuscatedName("al.af")
    public int field124;

    @ObfuscatedName("al.aj")
    public byte[] field125;

    @ObfuscatedName("al.am(S)V")
    public void method331() {
        this.field123 = new AudioFormat((float) Statics.field1994, 16, Statics.field4794 ? 2 : 1, true, false);
        this.field125 = new byte[0x100 << (Statics.field4794 ? 2 : 1)];
    }

    @ObfuscatedName("al.ap(IB)V")
    public void method338(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field123, arg0 << (Statics.field4794 ? 2 : 1));
            this.field122 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field122.open();
            this.field122.start();
            this.field124 = arg0;
        } catch (LineUnavailableException var4) {
            if (class318.method5356(arg0) == 1) {
                this.field122 = null;
                throw var4;
            } else {
                this.method338(class318.method2259(arg0));
            }
        }
    }

    @ObfuscatedName("al.af(B)I")
    public int method333() {
        return this.field124 - (this.field122.available() >> (Statics.field4794 ? 2 : 1));
    }

    @ObfuscatedName("al.aj()V")
    public void method342() {
        int var1 = 256;
        if (Statics.field4794) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field298[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field125[var2 * 2] = (byte) (var3 >> 8);
            this.field125[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field122.write(this.field125, 0, var1 << 1);
    }

    @ObfuscatedName("al.aq(I)V")
    public void method334() {
        if (this.field122 != null) {
            this.field122.close();
            this.field122 = null;
        }
    }

    @ObfuscatedName("al.ar(I)V")
    public void method335() {
        this.field122.flush();
    }
}
