package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ap")
public class class50 extends class103 {

    @ObfuscatedName("ap.a")
    public AudioFormat field432;

    @ObfuscatedName("ap.s")
    public SourceDataLine field433;

    @ObfuscatedName("ap.g")
    public int field434;

    @ObfuscatedName("ap.x")
    public byte[] field435;

    @ObfuscatedName("ap.a(I)V")
    public void method738() {
        this.field432 = new AudioFormat((float) Statics.field367, 16, Statics.field1136 ? 2 : 1, true, false);
        this.field435 = new byte[0x100 << (Statics.field1136 ? 2 : 1)];
    }

    @ObfuscatedName("ap.s(II)V")
    public void method718(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field432, arg0 << (Statics.field1136 ? 2 : 1));
            this.field433 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field433.open();
            this.field433.start();
            this.field434 = arg0;
        } catch (LineUnavailableException var4) {
            if (class195.method1660(arg0) == 1) {
                this.field433 = null;
                throw var4;
            } else {
                this.method718(class195.method97(arg0));
            }
        }
    }

    @ObfuscatedName("ap.g(I)I")
    public int method721() {
        return this.field434 - (this.field433.available() >> (Statics.field1136 ? 2 : 1));
    }

    @ObfuscatedName("ap.x()V")
    public void method722() {
        int var1 = 256;
        if (Statics.field1136) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1389[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field435[var2 * 2] = (byte) (var3 >> 8);
            this.field435[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field433.write(this.field435, 0, var1 << 1);
    }

    @ObfuscatedName("ap.h(I)V")
    public void method723() {
        if (this.field433 != null) {
            this.field433.close();
            this.field433 = null;
        }
    }

    @ObfuscatedName("ap.f(B)V")
    public void method719() {
        this.field433.flush();
    }
}
