package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("aw")
public class class25 extends class43 {

    @ObfuscatedName("aw.au")
    public AudioFormat field120;

    @ObfuscatedName("aw.ae")
    public SourceDataLine field121;

    @ObfuscatedName("aw.ao")
    public int field122;

    @ObfuscatedName("aw.at")
    public byte[] field123;

    @ObfuscatedName("aw.au(I)V")
    public void method334() {
        this.field120 = new AudioFormat((float) Statics.field294, 16, Statics.field309 ? 2 : 1, true, false);
        this.field123 = new byte[0x100 << (Statics.field309 ? 2 : 1)];
    }

    @ObfuscatedName("aw.ae(IB)V")
    public void method319(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field120, arg0 << (Statics.field309 ? 2 : 1));
            this.field121 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field121.open();
            this.field121.start();
            this.field122 = arg0;
        } catch (LineUnavailableException var4) {
            if (Statics.method5200(arg0) == 1) {
                this.field121 = null;
                throw var4;
            } else {
                this.method319(class304.method4709(arg0));
            }
        }
    }

    @ObfuscatedName("aw.ao(I)I")
    public int method322() {
        return this.field122 - (this.field121.available() >> (Statics.field309 ? 2 : 1));
    }

    @ObfuscatedName("aw.at()V")
    public void method323() {
        int var1 = 256;
        if (Statics.field309) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field299[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field123[var2 * 2] = (byte) (var3 >> 8);
            this.field123[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field121.write(this.field123, 0, var1 << 1);
    }

    @ObfuscatedName("aw.ac(I)V")
    public void method324() {
        if (this.field121 != null) {
            this.field121.close();
            this.field121 = null;
        }
    }

    @ObfuscatedName("aw.ai(B)V")
    public void method325() {
        this.field121.flush();
    }
}
