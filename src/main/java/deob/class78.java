package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("bi")
public class class78 {

    @ObfuscatedName("bi.i")
    public byte[] field1230 = new byte[4];

    @ObfuscatedName("bi.w")
    public int field1232;

    @ObfuscatedName("bi.a")
    public class154 field1228;

    @ObfuscatedName("bi.t")
    public DataInputStream field1229;

    @ObfuscatedName("bi.s")
    public int field1235;

    @ObfuscatedName("bi.r")
    public byte[] field1233;

    @ObfuscatedName("bi.v")
    public int field1234;

    @ObfuscatedName("bi.y")
    public long field1231;

    public class78(class155 arg0, URL arg1) {
        this.field1228 = arg0.method2674(arg1);
        this.field1232 = 0;
        this.field1231 = class176.method2862() + 30000L;
    }

    @ObfuscatedName("bi.i(B)[B")
    public byte[] method1401() throws IOException {
        if (class176.method2862() > this.field1231) {
            throw new IOException();
        }
        if (this.field1232 == 0) {
            if (this.field1228.field2244 == 2) {
                throw new IOException();
            }
            if (this.field1228.field2244 == 1) {
                this.field1229 = (DataInputStream) this.field1228.field2240;
                this.field1232 = 1;
            }
        }
        if (this.field1232 == 1) {
            this.field1235 += this.field1229.read(this.field1230, this.field1235, this.field1230.length - this.field1235);
            if (this.field1235 == 4) {
                int var1 = (new class174(this.field1230)).method2885();
                this.field1233 = new byte[var1];
                this.field1232 = 2;
            }
        }
        if (this.field1232 == 2) {
            this.field1234 += this.field1229.read(this.field1233, this.field1234, this.field1233.length - this.field1234);
            if (this.field1234 == this.field1233.length) {
                return this.field1233;
            }
        }
        return null;
    }
}
