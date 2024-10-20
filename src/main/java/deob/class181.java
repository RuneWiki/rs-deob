package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fh")
public final class class181 extends class315 implements Runnable {

    @ObfuscatedName("fh.m")
    public InputStream field2104;

    @ObfuscatedName("fh.o")
    public Socket field2098;

    @ObfuscatedName("fh.q")
    public OutputStream field2101;

    @ObfuscatedName("fh.j")
    public boolean field2099 = false;

    @ObfuscatedName("fh.p")
    public class176 field2110;

    @ObfuscatedName("fh.g")
    public class175 field2103;

    @ObfuscatedName("fh.n")
    public byte[] field2102;

    @ObfuscatedName("fh.u")
    public int field2096 = 0;

    @ObfuscatedName("fh.a")
    public int field2100 = 0;

    @ObfuscatedName("fh.z")
    public boolean field2105 = false;

    @ObfuscatedName("fh.w")
    public final int field2106;

    @ObfuscatedName("fh.y")
    public final int field2107;

    public class181(Socket arg0, class176 arg1, int arg2) throws IOException {
        this.field2110 = arg1;
        this.field2098 = arg0;
        this.field2106 = arg2;
        this.field2107 = arg2 - 100;
        this.field2098.setSoTimeout(30000);
        this.field2098.setTcpNoDelay(true);
        this.field2098.setReceiveBufferSize(65536);
        this.field2098.setSendBufferSize(65536);
        this.field2104 = this.field2098.getInputStream();
        this.field2101 = this.field2098.getOutputStream();
    }

    @ObfuscatedName("fh.m(I)V")
    public void method3322() {
        if (this.field2099) {
            return;
        }
        synchronized (this) {
            this.field2099 = true;
            this.notifyAll();
        }
        if (this.field2103 != null) {
            while (this.field2103.field2051 == 0) {
                class308.method3708(1L);
            }
            if (this.field2103.field2051 == 1) {
                try {
                    ((Thread) this.field2103.field2056).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2103 = null;
    }

    public void finalize() {
        this.method3322();
    }

    @ObfuscatedName("fh.o(B)I")
    public int method3300() throws IOException {
        return this.field2099 ? 0 : this.field2104.read();
    }

    @ObfuscatedName("fh.q(I)I")
    public int method3299() throws IOException {
        return this.field2099 ? 0 : this.field2104.available();
    }

    @ObfuscatedName("fh.j(II)Z")
    public boolean method3301(int arg0) throws IOException {
        if (this.field2099) {
            return false;
        } else {
            return this.field2104.available() >= arg0;
        }
    }

    @ObfuscatedName("fh.p([BIIB)I")
    public int method3302(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2099) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2104.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fh.g([BIII)V")
    public void method3303(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2099) {
            return;
        }
        if (this.field2105) {
            this.field2105 = false;
            throw new IOException();
        }
        if (this.field2102 == null) {
            this.field2102 = new byte[this.field2106];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2102[this.field2100] = arg0[arg1 + var5];
                this.field2100 = (this.field2100 + 1) % this.field2106;
                if ((this.field2107 + this.field2096) % this.field2106 == this.field2100) {
                    throw new IOException();
                }
            }
            if (this.field2103 == null) {
                this.field2103 = this.field2110.method3274(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2100 == this.field2096) {
                            if (this.field2099) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2096;
                        if (this.field2100 >= this.field2096) {
                            var4 = this.field2100 - this.field2096;
                        } else {
                            var4 = this.field2106 - this.field2096;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2101.write(this.field2102, var3, var4);
                    } catch (IOException var12) {
                        this.field2105 = true;
                    }
                    this.field2096 = (this.field2096 + var4) % this.field2106;
                    try {
                        if (this.field2100 == this.field2096) {
                            this.field2101.flush();
                        }
                    } catch (IOException var11) {
                        this.field2105 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2104 != null) {
                        this.field2104.close();
                    }
                    if (this.field2101 != null) {
                        this.field2101.close();
                    }
                    if (this.field2098 != null) {
                        this.field2098.close();
                    }
                } catch (IOException var10) {
                }
                this.field2102 = null;
                break;
            }
        } catch (Exception var15) {
            class351.method3425((String) null, var15);
        }
    }

    @ObfuscatedName("fh.n([BIIB)V")
    public void method3304(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3303(arg0, arg1, arg2);
    }
}
