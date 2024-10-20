package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("bp")
public class class78 {

    @ObfuscatedName("bp.i")
    public byte[] field1233 = new byte[4];

    @ObfuscatedName("bp.c")
    public int field1237;

    @ObfuscatedName("bp.e")
    public class154 field1230;

    @ObfuscatedName("bp.v")
    public DataInputStream field1232;

    @ObfuscatedName("bp.b")
    public int field1235;

    @ObfuscatedName("bp.y")
    public byte[] field1231;

    @ObfuscatedName("bp.h")
    public int field1236;

    @ObfuscatedName("bp.x")
    public long field1240;

    public class78(class155 arg0, URL arg1) {
        this.field1230 = arg0.method2701(arg1);
        this.field1237 = 0;
        this.field1240 = class176.method89() + 30000L;
    }

    @ObfuscatedName("bp.i(I)[B")
    public byte[] method1379() throws IOException {
        if (class176.method89() > this.field1240) {
            throw new IOException();
        }
        if (this.field1237 == 0) {
            if (this.field1230.field2245 == 2) {
                throw new IOException();
            }
            if (this.field1230.field2245 == 1) {
                this.field1232 = (DataInputStream) this.field1230.field2249;
                this.field1237 = 1;
            }
        }
        if (this.field1237 == 1) {
            this.field1235 += this.field1232.read(this.field1233, this.field1235, this.field1233.length - this.field1235);
            if (this.field1235 == 4) {
                int var1 = (new class174(this.field1233)).method2875();
                this.field1231 = new byte[var1];
                this.field1237 = 2;
            }
        }
        if (this.field1237 == 2) {
            this.field1236 += this.field1232.read(this.field1231, this.field1236, this.field1231.length - this.field1236);
            if (this.field1236 == this.field1231.length) {
                return this.field1231;
            }
        }
        return null;
    }
}
