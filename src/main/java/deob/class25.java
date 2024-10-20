package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ad")
public class class25 extends class43 {

    @ObfuscatedName("ad.at")
    public AudioFormat field118;

    @ObfuscatedName("ad.ah")
    public SourceDataLine field120;

    @ObfuscatedName("ad.ar")
    public int field119;

    @ObfuscatedName("ad.ao")
    public byte[] field117;

    @ObfuscatedName("ad.at(B)V")
    public void method330() {
        this.field118 = new AudioFormat((float) Statics.field276, 16, Statics.field2581 ? 2 : 1, true, false);
        this.field117 = new byte[0x100 << (Statics.field2581 ? 2 : 1)];
    }

    @ObfuscatedName("ad.ah(II)V")
    public void method331(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field118, arg0 << (Statics.field2581 ? 2 : 1));
            this.field120 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field120.open();
            this.field120.start();
            this.field119 = arg0;
        } catch (LineUnavailableException var4) {
            if (class315.method2792(arg0) == 1) {
                this.field120 = null;
                throw var4;
            } else {
                this.method331(class315.method3369(arg0));
            }
        }
    }

    @ObfuscatedName("ad.ar(I)I")
    public int method339() {
        return this.field119 - (this.field120.available() >> (Statics.field2581 ? 2 : 1));
    }

    @ObfuscatedName("ad.ao()V")
    public void method349() {
        int var1 = 256;
        if (Statics.field2581) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field278[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field117[var2 * 2] = (byte) (var3 >> 8);
            this.field117[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field120.write(this.field117, 0, var1 << 1);
    }

    @ObfuscatedName("ad.ab(I)V")
    public void method334() {
        if (this.field120 != null) {
            this.field120.close();
            this.field120 = null;
        }
    }

    @ObfuscatedName("ad.au(I)V")
    public void method335() {
        this.field120.flush();
    }
}
