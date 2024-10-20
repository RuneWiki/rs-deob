package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("al")
public class class25 extends class43 {

    @ObfuscatedName("al.at")
    public AudioFormat field123;

    @ObfuscatedName("al.an")
    public SourceDataLine field124;

    @ObfuscatedName("al.av")
    public int field126;

    @ObfuscatedName("al.as")
    public byte[] field125;

    @ObfuscatedName("al.at(I)V")
    public void method323() {
        this.field123 = new AudioFormat((float) Statics.field292, 16, Statics.field3873 ? 2 : 1, true, false);
        this.field125 = new byte[0x100 << (Statics.field3873 ? 2 : 1)];
    }

    @ObfuscatedName("al.an(II)V")
    public void method324(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field123, arg0 << (Statics.field3873 ? 2 : 1));
            this.field124 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field124.open();
            this.field124.start();
            this.field126 = arg0;
        } catch (LineUnavailableException var4) {
            if (class303.method3696(arg0) == 1) {
                this.field124 = null;
                throw var4;
            } else {
                this.method324(class303.method2820(arg0));
            }
        }
    }

    @ObfuscatedName("al.av(I)I")
    public int method325() {
        return this.field126 - (this.field124.available() >> (Statics.field3873 ? 2 : 1));
    }

    @ObfuscatedName("al.as()V")
    public void method326() {
        int var1 = 256;
        if (Statics.field3873) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field286[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field125[var2 * 2] = (byte) (var3 >> 8);
            this.field125[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field124.write(this.field125, 0, var1 << 1);
    }

    @ObfuscatedName("al.ax(I)V")
    public void method332() {
        if (this.field124 != null) {
            this.field124.close();
            this.field124 = null;
        }
    }

    @ObfuscatedName("al.ap(I)V")
    public void method322() {
        this.field124.flush();
    }
}
