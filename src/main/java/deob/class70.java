package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ba")
public class class70 extends class57 {

    @ObfuscatedName("ba.j")
    public AudioFormat field1294;

    @ObfuscatedName("ba.l")
    public SourceDataLine field1293;

    @ObfuscatedName("ba.aw")
    public int field1292;

    @ObfuscatedName("ba.az")
    public byte[] field1295;

    @ObfuscatedName("ba.j(Ljava/awt/Component;)V")
    public void method1106(Component arg0) {
        this.field1294 = new AudioFormat((float) Statics.field1781, 16, Statics.field1192 ? 2 : 1, true, false);
        this.field1295 = new byte[0x100 << (Statics.field1192 ? 2 : 1)];
    }

    @ObfuscatedName("ba.l(I)V")
    public void method1099(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1294, arg0 << (Statics.field1192 ? 2 : 1));
            this.field1293 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1293.open();
            this.field1293.start();
            this.field1292 = arg0;
        } catch (LineUnavailableException var4) {
            if (class126.method230(arg0) == 1) {
                this.field1293 = null;
                throw var4;
            } else {
                this.method1099(Statics.method1476(arg0));
            }
        }
    }

    @ObfuscatedName("ba.a()I")
    public int method1101() {
        return this.field1292 - (this.field1293.available() >> (Statics.field1192 ? 2 : 1));
    }

    @ObfuscatedName("ba.i()V")
    public void method1107() {
        int var1 = 256;
        if (Statics.field1192) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1201[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1295[var2 * 2] = (byte) (var3 >> 8);
            this.field1295[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1293.write(this.field1295, 0, var1 << 1);
    }

    @ObfuscatedName("ba.f()V")
    public void method1102() {
        if (this.field1293 != null) {
            this.field1293.close();
            this.field1293 = null;
        }
    }

    @ObfuscatedName("ba.m()V")
    public void method1103() {
        this.field1293.flush();
    }
}
