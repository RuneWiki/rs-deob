package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("eg")
public final class class144 implements Runnable {

    @ObfuscatedName("eg.e")
    public InputStream field2187;

    @ObfuscatedName("eg.w")
    public OutputStream field2173;

    @ObfuscatedName("eg.f")
    public Socket field2174;

    @ObfuscatedName("eg.s")
    public boolean field2180 = false;

    @ObfuscatedName("eg.p")
    public class137 field2184;

    @ObfuscatedName("eg.h")
    public class147 field2177;

    @ObfuscatedName("eg.g")
    public byte[] field2178;

    @ObfuscatedName("eg.a")
    public int field2179 = 0;

    @ObfuscatedName("eg.r")
    public int field2172 = 0;

    @ObfuscatedName("eg.k")
    public boolean field2181 = false;

    public class144(Socket arg0, class137 arg1) throws IOException {
        this.field2184 = arg1;
        this.field2174 = arg0;
        this.field2174.setSoTimeout(30000);
        this.field2174.setTcpNoDelay(true);
        this.field2174.setReceiveBufferSize(16384);
        this.field2174.setSendBufferSize(16384);
        this.field2187 = this.field2174.getInputStream();
        this.field2173 = this.field2174.getOutputStream();
    }

    @ObfuscatedName("eg.w(I)V")
    public void method2801() {
        if (this.field2180) {
            return;
        }
        synchronized (this) {
            this.field2180 = true;
            this.notifyAll();
        }
        if (this.field2177 != null) {
            while (this.field2177.field2214 == 0) {
                class128.method2645(1L);
            }
            if (this.field2177.field2214 == 1) {
                try {
                    ((Thread) this.field2177.field2217).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2177 = null;
    }

    public void finalize() {
        this.method2801();
    }

    @ObfuscatedName("eg.f(I)I")
    public int method2803() throws IOException {
        return this.field2180 ? 0 : this.field2187.read();
    }

    @ObfuscatedName("eg.s(I)I")
    public int method2804() throws IOException {
        return this.field2180 ? 0 : this.field2187.available();
    }

    @ObfuscatedName("eg.p([BIII)V")
    public void method2810(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2180) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2187.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("eg.h([BIIS)V")
    public void method2802(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2180) {
            return;
        }
        if (this.field2181) {
            this.field2181 = false;
            throw new IOException();
        }
        if (this.field2178 == null) {
            this.field2178 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2178[this.field2172] = arg0[arg1 + var5];
                this.field2172 = (this.field2172 + 1) % 5000;
                if ((this.field2179 + 4900) % 5000 == this.field2172) {
                    throw new IOException();
                }
            }
            if (this.field2177 == null) {
                this.field2177 = this.field2184.method2715(this, 3);
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
                        if (this.field2179 == this.field2172) {
                            if (this.field2180) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2179;
                        if (this.field2172 >= this.field2179) {
                            var4 = this.field2172 - this.field2179;
                        } else {
                            var4 = 5000 - this.field2179;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2173.write(this.field2178, var3, var4);
                    } catch (IOException var12) {
                        this.field2181 = true;
                    }
                    this.field2179 = (this.field2179 + var4) % 5000;
                    try {
                        if (this.field2179 == this.field2172) {
                            this.field2173.flush();
                        }
                    } catch (IOException var11) {
                        this.field2181 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2187 != null) {
                        this.field2187.close();
                    }
                    if (this.field2173 != null) {
                        this.field2173.close();
                    }
                    if (this.field2174 != null) {
                        this.field2174.close();
                    }
                } catch (IOException var10) {
                }
                this.field2178 = null;
                break;
            }
        } catch (Exception var15) {
            class149.method17((String) null, var15);
        }
    }
}
