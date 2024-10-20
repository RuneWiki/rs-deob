package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fh")
public final class class181 extends class315 implements Runnable {

    @ObfuscatedName("fh.z")
    public InputStream field2109;

    @ObfuscatedName("fh.k")
    public OutputStream field2104;

    @ObfuscatedName("fh.s")
    public Socket field2105;

    @ObfuscatedName("fh.t")
    public boolean field2106 = false;

    @ObfuscatedName("fh.i")
    public class176 field2110;

    @ObfuscatedName("fh.o")
    public class175 field2113;

    @ObfuscatedName("fh.x")
    public byte[] field2107;

    @ObfuscatedName("fh.w")
    public int field2108 = 0;

    @ObfuscatedName("fh.g")
    public int field2111 = 0;

    @ObfuscatedName("fh.m")
    public boolean field2112 = false;

    @ObfuscatedName("fh.n")
    public final int field2103;

    @ObfuscatedName("fh.d")
    public final int field2114;

    public class181(Socket arg0, class176 arg1, int arg2) throws IOException {
        this.field2110 = arg1;
        this.field2105 = arg0;
        this.field2103 = arg2;
        this.field2114 = arg2 - 100;
        this.field2105.setSoTimeout(30000);
        this.field2105.setTcpNoDelay(true);
        this.field2105.setReceiveBufferSize(65536);
        this.field2105.setSendBufferSize(65536);
        this.field2109 = this.field2105.getInputStream();
        this.field2104 = this.field2105.getOutputStream();
    }

    @ObfuscatedName("fh.z(I)V")
    public void method3308() {
        if (this.field2106) {
            return;
        }
        synchronized (this) {
            this.field2106 = true;
            this.notifyAll();
        }
        if (this.field2113 != null) {
            while (this.field2113.field2065 == 0) {
                class308.method3834(1L);
            }
            if (this.field2113.field2065 == 1) {
                try {
                    ((Thread) this.field2113.field2068).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2113 = null;
    }

    public void finalize() {
        this.method3308();
    }

    @ObfuscatedName("fh.k(B)I")
    public int method3309() throws IOException {
        return this.field2106 ? 0 : this.field2109.read();
    }

    @ObfuscatedName("fh.s(B)I")
    public int method3310() throws IOException {
        return this.field2106 ? 0 : this.field2109.available();
    }

    @ObfuscatedName("fh.t(IB)Z")
    public boolean method3311(int arg0) throws IOException {
        if (this.field2106) {
            return false;
        } else {
            return this.field2109.available() >= arg0;
        }
    }

    @ObfuscatedName("fh.i([BIII)I")
    public int method3312(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2106) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2109.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fh.o([BIII)V")
    public void method3317(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2106) {
            return;
        }
        if (this.field2112) {
            this.field2112 = false;
            throw new IOException();
        }
        if (this.field2107 == null) {
            this.field2107 = new byte[this.field2103];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2107[this.field2111] = arg0[arg1 + var5];
                this.field2111 = (this.field2111 + 1) % this.field2103;
                if ((this.field2114 + this.field2108) % this.field2103 == this.field2111) {
                    throw new IOException();
                }
            }
            if (this.field2113 == null) {
                this.field2113 = this.field2110.method3280(this, 3);
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
                        if (this.field2111 == this.field2108) {
                            if (this.field2106) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2108;
                        if (this.field2111 >= this.field2108) {
                            var4 = this.field2111 - this.field2108;
                        } else {
                            var4 = this.field2103 - this.field2108;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2104.write(this.field2107, var3, var4);
                    } catch (IOException var12) {
                        this.field2112 = true;
                    }
                    this.field2108 = (this.field2108 + var4) % this.field2103;
                    try {
                        if (this.field2111 == this.field2108) {
                            this.field2104.flush();
                        }
                    } catch (IOException var11) {
                        this.field2112 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2109 != null) {
                        this.field2109.close();
                    }
                    if (this.field2104 != null) {
                        this.field2104.close();
                    }
                    if (this.field2105 != null) {
                        this.field2105.close();
                    }
                } catch (IOException var10) {
                }
                this.field2107 = null;
                break;
            }
        } catch (Exception var15) {
            class351.method2420((String) null, var15);
        }
    }

    @ObfuscatedName("fh.x([BIIB)V")
    public void method3315(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3317(arg0, arg1, arg2);
    }
}
