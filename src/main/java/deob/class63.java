package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bh")
public class class63 extends class50 {

    @ObfuscatedName("bh.p")
    public AudioFormat field1175;

    @ObfuscatedName("bh.g")
    public SourceDataLine field1174;

    @ObfuscatedName("bh.al")
    public int field1176;

    @ObfuscatedName("bh.as")
    public byte[] field1177;

    @ObfuscatedName("bh.p(Ljava/awt/Component;)V")
    public void method979(Component arg0) {
        this.field1175 = new AudioFormat((float) Statics.field2674, 16, Statics.field1924 ? 2 : 1, true, false);
        this.field1177 = new byte[0x100 << (Statics.field1924 ? 2 : 1)];
    }

    @ObfuscatedName("bh.g(I)V")
    public void method980(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1175, arg0 << (Statics.field1924 ? 2 : 1));
            this.field1174 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1174.open();
            this.field1174.start();
            this.field1176 = arg0;
        } catch (LineUnavailableException var4) {
            if (class113.method652(arg0) == 1) {
                this.field1174 = null;
                throw var4;
            } else {
                this.method980(class113.method2443(arg0));
            }
        }
    }

    @ObfuscatedName("bh.x()I")
    public int method981() {
        return this.field1176 - (this.field1174.available() >> (Statics.field1924 ? 2 : 1));
    }

    @ObfuscatedName("bh.c()V")
    public void method997() {
        int var1 = 256;
        if (Statics.field1924) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1071[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1177[var2 * 2] = (byte) (var3 >> 8);
            this.field1177[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1174.write(this.field1177, 0, var1 << 1);
    }

    @ObfuscatedName("bh.n()V")
    public void method983() {
        if (this.field1174 != null) {
            this.field1174.close();
            this.field1174 = null;
        }
    }

    @ObfuscatedName("bh.s()V")
    public void method986() {
        this.field1174.flush();
    }
}
