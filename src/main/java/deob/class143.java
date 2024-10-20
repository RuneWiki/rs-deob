package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ea")
public final class class143 implements Runnable {

    @ObfuscatedName("ea.n")
    public InputStream field2164;

    @ObfuscatedName("ea.d")
    public OutputStream field2162;

    @ObfuscatedName("ea.s")
    public Socket field2174;

    @ObfuscatedName("ea.q")
    public boolean field2173 = false;

    @ObfuscatedName("ea.j")
    public class136 field2165;

    @ObfuscatedName("ea.k")
    public class146 field2161;

    @ObfuscatedName("ea.i")
    public byte[] field2167;

    @ObfuscatedName("ea.m")
    public int field2168 = 0;

    @ObfuscatedName("ea.p")
    public int field2169 = 0;

    @ObfuscatedName("ea.h")
    public boolean field2163 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2165 = arg1;
        this.field2174 = arg0;
        this.field2174.setSoTimeout(30000);
        this.field2174.setTcpNoDelay(true);
        this.field2174.setReceiveBufferSize(16384);
        this.field2174.setSendBufferSize(16384);
        this.field2164 = this.field2174.getInputStream();
        this.field2162 = this.field2174.getOutputStream();
    }

    @ObfuscatedName("ea.s(B)V")
    public void method2810() {
        if (this.field2173) {
            return;
        }
        synchronized (this) {
            this.field2173 = true;
            this.notifyAll();
        }
        if (this.field2161 != null) {
            while (this.field2161.field2202 == 0) {
                class127.method1160(1L);
            }
            if (this.field2161.field2202 == 1) {
                try {
                    ((Thread) this.field2161.field2205).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2161 = null;
    }

    public void finalize() {
        this.method2810();
    }

    @ObfuscatedName("ea.q(I)I")
    public int method2804() throws IOException {
        return this.field2173 ? 0 : this.field2164.read();
    }

    @ObfuscatedName("ea.j(B)I")
    public int method2805() throws IOException {
        return this.field2173 ? 0 : this.field2164.available();
    }

    @ObfuscatedName("ea.k([BIIB)V")
    public void method2806(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2173) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2164.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ea.i([BIII)V")
    public void method2807(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2173) {
            return;
        }
        if (this.field2163) {
            this.field2163 = false;
            throw new IOException();
        }
        if (this.field2167 == null) {
            this.field2167 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2167[this.field2169] = arg0[arg1 + var5];
                this.field2169 = (this.field2169 + 1) % 5000;
                if ((this.field2168 + 4900) % 5000 == this.field2169) {
                    throw new IOException();
                }
            }
            if (this.field2161 == null) {
                this.field2161 = this.field2165.method2709(this, 3);
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
                        if (this.field2169 == this.field2168) {
                            if (this.field2173) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2168;
                        if (this.field2169 >= this.field2168) {
                            var4 = this.field2169 - this.field2168;
                        } else {
                            var4 = 5000 - this.field2168;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2162.write(this.field2167, var3, var4);
                    } catch (IOException var12) {
                        this.field2163 = true;
                    }
                    this.field2168 = (this.field2168 + var4) % 5000;
                    try {
                        if (this.field2169 == this.field2168) {
                            this.field2162.flush();
                        }
                    } catch (IOException var11) {
                        this.field2163 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2164 != null) {
                        this.field2164.close();
                    }
                    if (this.field2162 != null) {
                        this.field2162.close();
                    }
                    if (this.field2174 != null) {
                        this.field2174.close();
                    }
                } catch (IOException var10) {
                }
                this.field2167 = null;
                break;
            }
        } catch (Exception var15) {
            Statics.method2798((String) null, var15);
        }
    }
}
