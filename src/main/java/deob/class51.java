package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ad")
public class class51 extends class52 {

    @ObfuscatedName("ad.a")
    public AudioFormat field1105;

    @ObfuscatedName("ad.x")
    public SourceDataLine field1104;

    @ObfuscatedName("ad.e")
    public int field1106;

    @ObfuscatedName("ad.r")
    public byte[] field1103;

    @ObfuscatedName("ad.a(Ljava/awt/Component;)V")
    public void method924(Component arg0) {
        this.field1105 = new AudioFormat((float) Statics.field1989, 16, Statics.field1125 ? 2 : 1, true, false);
        this.field1103 = new byte[0x100 << (Statics.field1125 ? 2 : 1)];
    }

    @ObfuscatedName("ad.x(I)V")
    public void method926(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1105, arg0 << (Statics.field1125 ? 2 : 1));
            this.field1104 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1104.open();
            this.field1104.start();
            this.field1106 = arg0;
        } catch (LineUnavailableException var4) {
            if (class124.method1979(arg0) == 1) {
                this.field1104 = null;
                throw var4;
            } else {
                this.method926(class124.method2145(arg0));
            }
        }
    }

    @ObfuscatedName("ad.e()I")
    public int method927() {
        return this.field1106 - (this.field1104.available() >> (Statics.field1125 ? 2 : 1));
    }

    @ObfuscatedName("ad.r()V")
    public void method928() {
        int var1 = 256;
        if (Statics.field1125) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1127[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1103[var2 * 2] = (byte) (var3 >> 8);
            this.field1103[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1104.write(this.field1103, 0, var1 << 1);
    }

    @ObfuscatedName("ad.p()V")
    public void method929() {
        if (this.field1104 != null) {
            this.field1104.close();
            this.field1104 = null;
        }
    }

    @ObfuscatedName("ad.n()V")
    public void method940() {
        this.field1104.flush();
    }
}
