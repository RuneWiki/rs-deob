package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bb")
public class class68 extends class55 {

    @ObfuscatedName("bb.j")
    public AudioFormat field1254;

    @ObfuscatedName("bb.y")
    public SourceDataLine field1253;

    @ObfuscatedName("bb.ak")
    public int field1252;

    @ObfuscatedName("bb.an")
    public byte[] field1255;

    @ObfuscatedName("bb.j(Ljava/awt/Component;)V")
    public void method1142(Component arg0) {
        this.field1254 = new AudioFormat((float) Statics.field1163, 16, Statics.field1145 ? 2 : 1, true, false);
        this.field1255 = new byte[0x100 << (Statics.field1145 ? 2 : 1)];
    }

    @ObfuscatedName("bb.y(I)V")
    public void method1131(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1254, arg0 << (Statics.field1145 ? 2 : 1));
            this.field1253 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1253.open();
            this.field1253.start();
            this.field1252 = arg0;
        } catch (LineUnavailableException var4) {
            if (class121.method700(arg0) == 1) {
                this.field1253 = null;
                throw var4;
            } else {
                this.method1131(class121.method1519(arg0));
            }
        }
    }

    @ObfuscatedName("bb.z()I")
    public int method1132() {
        return this.field1252 - (this.field1253.available() >> (Statics.field1145 ? 2 : 1));
    }

    @ObfuscatedName("bb.l()V")
    public void method1133() {
        int var1 = 256;
        if (Statics.field1145) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1159[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1255[var2 * 2] = (byte) (var3 >> 8);
            this.field1255[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1253.write(this.field1255, 0, var1 << 1);
    }

    @ObfuscatedName("bb.w()V")
    public void method1129() {
        if (this.field1253 != null) {
            this.field1253.close();
            this.field1253 = null;
        }
    }

    @ObfuscatedName("bb.d()V")
    public void method1141() {
        this.field1253.flush();
    }
}
