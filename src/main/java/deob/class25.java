package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("af")
public class class25 extends class43 {

    @ObfuscatedName("af.ac")
    public AudioFormat field121;

    @ObfuscatedName("af.al")
    public SourceDataLine field122;

    @ObfuscatedName("af.ak")
    public int field123;

    @ObfuscatedName("af.ax")
    public byte[] field124;

    @ObfuscatedName("af.ac(I)V")
    public void method314() {
        this.field121 = new AudioFormat((float) Statics.field307, 16, Statics.field3131 ? 2 : 1, true, false);
        this.field124 = new byte[0x100 << (Statics.field3131 ? 2 : 1)];
    }

    @ObfuscatedName("af.al(IB)V")
    public void method315(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field121, arg0 << (Statics.field3131 ? 2 : 1));
            this.field122 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field122.open();
            this.field122.start();
            this.field123 = arg0;
        } catch (LineUnavailableException var4) {
            if (class318.method5167(arg0) == 1) {
                this.field122 = null;
                throw var4;
            } else {
                this.method315(class318.method3444(arg0));
            }
        }
    }

    @ObfuscatedName("af.ak(I)I")
    public int method316() {
        return this.field123 - (this.field122.available() >> (Statics.field3131 ? 2 : 1));
    }

    @ObfuscatedName("af.ax()V")
    public void method317() {
        int var1 = 256;
        if (Statics.field3131) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field296[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field124[var2 * 2] = (byte) (var3 >> 8);
            this.field124[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field122.write(this.field124, 0, var1 << 1);
    }

    @ObfuscatedName("af.ao(S)V")
    public void method318() {
        if (this.field122 != null) {
            this.field122.close();
            this.field122 = null;
        }
    }

    @ObfuscatedName("af.ah(B)V")
    public void method333() {
        this.field122.flush();
    }
}
