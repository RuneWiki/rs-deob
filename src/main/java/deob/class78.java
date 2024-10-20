package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("ba")
public class class78 {

    @ObfuscatedName("ba.i")
    public byte[] field1191 = new byte[4];

    @ObfuscatedName("ba.h")
    public int field1190;

    @ObfuscatedName("ba.u")
    public class154 field1196;

    @ObfuscatedName("ba.q")
    public DataInputStream field1198;

    @ObfuscatedName("ba.g")
    public int field1193;

    @ObfuscatedName("ba.v")
    public byte[] field1192;

    @ObfuscatedName("ba.t")
    public int field1195;

    @ObfuscatedName("ba.p")
    public long field1194;

    public class78(class155 arg0, URL arg1) {
        this.field1196 = arg0.method2717(arg1);
        this.field1190 = 0;
        this.field1194 = class176.method3821() + 30000L;
    }

    @ObfuscatedName("ba.i(I)[B")
    public byte[] method1399() throws IOException {
        if (class176.method3821() > this.field1194) {
            throw new IOException();
        }
        if (this.field1190 == 0) {
            if (this.field1196.field2210 == 2) {
                throw new IOException();
            }
            if (this.field1196.field2210 == 1) {
                this.field1198 = (DataInputStream) this.field1196.field2212;
                this.field1190 = 1;
            }
        }
        if (this.field1190 == 1) {
            this.field1193 += this.field1198.read(this.field1191, this.field1193, this.field1191.length - this.field1193);
            if (this.field1193 == 4) {
                int var1 = (new class174(this.field1191)).method2927();
                this.field1192 = new byte[var1];
                this.field1190 = 2;
            }
        }
        if (this.field1190 == 2) {
            this.field1195 += this.field1198.read(this.field1192, this.field1195, this.field1192.length - this.field1195);
            if (this.field1195 == this.field1192.length) {
                return this.field1192;
            }
        }
        return null;
    }
}
