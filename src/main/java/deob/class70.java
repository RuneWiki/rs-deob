package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bq")
public class class70 extends class57 {

    @ObfuscatedName("bq.b")
    public AudioFormat field1253;

    @ObfuscatedName("bq.g")
    public SourceDataLine field1254;

    @ObfuscatedName("bq.ae")
    public int field1252;

    @ObfuscatedName("bq.aj")
    public byte[] field1255;

    @ObfuscatedName("bq.b(Ljava/awt/Component;)V")
    public void method1083(Component arg0) {
        this.field1253 = new AudioFormat((float) Statics.field1154, 16, Statics.field582 ? 2 : 1, true, false);
        this.field1255 = new byte[0x100 << (Statics.field582 ? 2 : 1)];
    }

    @ObfuscatedName("bq.g(I)V")
    public void method1103(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1253, arg0 << (Statics.field582 ? 2 : 1));
            this.field1254 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1254.open();
            this.field1254.start();
            this.field1252 = arg0;
        } catch (LineUnavailableException var4) {
            if (class127.method972(arg0) == 1) {
                this.field1254 = null;
                throw var4;
            } else {
                this.method1103(class127.method948(arg0));
            }
        }
    }

    @ObfuscatedName("bq.j()I")
    public int method1105() {
        return this.field1252 - (this.field1254.available() >> (Statics.field582 ? 2 : 1));
    }

    @ObfuscatedName("bq.d()V")
    public void method1086() {
        int var1 = 256;
        if (Statics.field582) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1149[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1255[var2 * 2] = (byte) (var3 >> 8);
            this.field1255[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1254.write(this.field1255, 0, var1 << 1);
    }

    @ObfuscatedName("bq.x()V")
    public void method1087() {
        if (this.field1254 != null) {
            this.field1254.close();
            this.field1254 = null;
        }
    }

    @ObfuscatedName("bq.y()V")
    public void method1088() {
        this.field1254.flush();
    }
}
