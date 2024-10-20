package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bl")
public class class63 extends class50 {

    @ObfuscatedName("bl.g")
    public AudioFormat field1180;

    @ObfuscatedName("bl.s")
    public SourceDataLine field1182;

    @ObfuscatedName("bl.as")
    public int field1181;

    @ObfuscatedName("bl.ax")
    public byte[] field1183;

    @ObfuscatedName("bl.g(Ljava/awt/Component;)V")
    public void method908(Component arg0) {
        this.field1180 = new AudioFormat((float) Statics.field1078, 16, Statics.field1072 ? 2 : 1, true, false);
        this.field1183 = new byte[0x100 << (Statics.field1072 ? 2 : 1)];
    }

    @ObfuscatedName("bl.s(I)V")
    public void method921(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1180, arg0 << (Statics.field1072 ? 2 : 1));
            this.field1182 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1182.open();
            this.field1182.start();
            this.field1181 = arg0;
        } catch (LineUnavailableException var4) {
            if (class113.method814(arg0) == 1) {
                this.field1182 = null;
                throw var4;
            } else {
                this.method921(Statics.method2573(arg0));
            }
        }
    }

    @ObfuscatedName("bl.v()I")
    public int method929() {
        return this.field1181 - (this.field1182.available() >> (Statics.field1072 ? 2 : 1));
    }

    @ObfuscatedName("bl.o()V")
    public void method924() {
        int var1 = 256;
        if (Statics.field1072) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1075[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1183[var2 * 2] = (byte) (var3 >> 8);
            this.field1183[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1182.write(this.field1183, 0, var1 << 1);
    }

    @ObfuscatedName("bl.k()V")
    public void method912() {
        if (this.field1182 != null) {
            this.field1182.close();
            this.field1182 = null;
        }
    }

    @ObfuscatedName("bl.m()V")
    public void method911() {
        this.field1182.flush();
    }
}
