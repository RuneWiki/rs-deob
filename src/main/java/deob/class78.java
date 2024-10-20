package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("bi")
public class class78 {

    @ObfuscatedName("bi.w")
    public int field1230;

    @ObfuscatedName("bi.o")
    public class155 field1228;

    @ObfuscatedName("bi.x")
    public DataInputStream field1225;

    @ObfuscatedName("bi.k")
    public byte[] field1224 = new byte[4];

    @ObfuscatedName("bi.f")
    public int field1227;

    @ObfuscatedName("bi.i")
    public byte[] field1223;

    @ObfuscatedName("bi.j")
    public int field1229;

    @ObfuscatedName("bi.m")
    public long field1226;

    public class78(class156 arg0, URL arg1) {
        this.field1228 = arg0.method2672(arg1);
        this.field1230 = 0;
        this.field1226 = class179.method1665() + 30000L;
    }

    @ObfuscatedName("bi.w(B)[B")
    public byte[] method1384() throws IOException {
        if (class179.method1665() > this.field1226) {
            throw new IOException();
        }
        if (this.field1230 == 0) {
            if (this.field1228.field2240 == 2) {
                throw new IOException();
            }
            if (this.field1228.field2240 == 1) {
                this.field1225 = (DataInputStream) this.field1228.field2246;
                this.field1230 = 1;
            }
        }
        if (this.field1230 == 1) {
            this.field1227 += this.field1225.read(this.field1224, this.field1227, this.field1224.length - this.field1227);
            if (this.field1227 == 4) {
                int var1 = (new class177(this.field1224)).method2904();
                this.field1223 = new byte[var1];
                this.field1230 = 2;
            }
        }
        if (this.field1230 == 2) {
            this.field1229 += this.field1225.read(this.field1223, this.field1229, this.field1223.length - this.field1229);
            if (this.field1229 == this.field1223.length) {
                return this.field1223;
            }
        }
        return null;
    }
}
