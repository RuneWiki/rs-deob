package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ae")
public class class25 extends class43 {

    @ObfuscatedName("ae.af")
    public SourceDataLine field130;

    @ObfuscatedName("ae.an")
    public AudioFormat field129;

    @ObfuscatedName("ae.aw")
    public int field128;

    @ObfuscatedName("ae.ac")
    public byte[] field131;

    @ObfuscatedName("ae.af(B)V")
    public void method326() {
        this.field129 = new AudioFormat((float) Statics.field307, 16, Statics.field314 ? 2 : 1, true, false);
        this.field131 = new byte[0x100 << (Statics.field314 ? 2 : 1)];
    }

    @ObfuscatedName("ae.an(II)V")
    public void method329(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field129, arg0 << (Statics.field314 ? 2 : 1));
            this.field130 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field130.open();
            this.field130.start();
            this.field128 = arg0;
        } catch (LineUnavailableException var4) {
            if (class296.method282(arg0) == 1) {
                this.field130 = null;
                throw var4;
            } else {
                this.method329(class296.method1948(arg0));
            }
        }
    }

    @ObfuscatedName("ae.aw(I)I")
    public int method332() {
        return this.field128 - (this.field130.available() >> (Statics.field314 ? 2 : 1));
    }

    @ObfuscatedName("ae.ac()V")
    public void method327() {
        int var1 = 256;
        if (Statics.field314) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field301[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field131[var2 * 2] = (byte) (var3 >> 8);
            this.field131[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field130.write(this.field131, 0, var1 << 1);
    }

    @ObfuscatedName("ae.au(I)V")
    public void method330() {
        if (this.field130 != null) {
            this.field130.close();
            this.field130 = null;
        }
    }

    @ObfuscatedName("ae.ab(B)V")
    public void method328() {
        this.field130.flush();
    }
}
