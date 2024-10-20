package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("er")
public final class class143 implements Runnable {

    @ObfuscatedName("er.o")
    public Socket field2175;

    @ObfuscatedName("er.e")
    public InputStream field2181;

    @ObfuscatedName("er.u")
    public OutputStream field2173;

    @ObfuscatedName("er.b")
    public boolean field2182 = false;

    @ObfuscatedName("er.p")
    public class136 field2174;

    @ObfuscatedName("er.s")
    public class146 field2177;

    @ObfuscatedName("er.y")
    public byte[] field2178;

    @ObfuscatedName("er.t")
    public int field2179 = 0;

    @ObfuscatedName("er.w")
    public int field2180 = 0;

    @ObfuscatedName("er.h")
    public boolean field2172 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2174 = arg1;
        this.field2175 = arg0;
        this.field2175.setSoTimeout(30000);
        this.field2175.setTcpNoDelay(true);
        this.field2175.setReceiveBufferSize(16384);
        this.field2175.setSendBufferSize(16384);
        this.field2181 = this.field2175.getInputStream();
        this.field2173 = this.field2175.getOutputStream();
    }

    @ObfuscatedName("er.b(I)V")
    public void method2816() {
        if (this.field2182) {
            return;
        }
        synchronized (this) {
            this.field2182 = true;
            this.notifyAll();
        }
        if (this.field2177 != null) {
            while (this.field2177.field2208 == 0) {
                class127.method2614(1L);
            }
            if (this.field2177.field2208 == 1) {
                try {
                    ((Thread) this.field2177.field2215).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2177 = null;
    }

    public void finalize() {
        this.method2816();
    }

    @ObfuscatedName("er.p(I)I")
    public int method2817() throws IOException {
        return this.field2182 ? 0 : this.field2181.read();
    }

    @ObfuscatedName("er.s(B)I")
    public int method2818() throws IOException {
        return this.field2182 ? 0 : this.field2181.available();
    }

    @ObfuscatedName("er.y([BIIB)V")
    public void method2819(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2182) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2181.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("er.t([BIII)V")
    public void method2820(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2182) {
            return;
        }
        if (this.field2172) {
            this.field2172 = false;
            throw new IOException();
        }
        if (this.field2178 == null) {
            this.field2178 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2178[this.field2180] = arg0[arg1 + var5];
                this.field2180 = (this.field2180 + 1) % 5000;
                if ((this.field2179 + 4900) % 5000 == this.field2180) {
                    throw new IOException();
                }
            }
            if (this.field2177 == null) {
                this.field2177 = this.field2174.method2710(this, 3);
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
                        if (this.field2180 == this.field2179) {
                            if (this.field2182) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2179;
                        if (this.field2180 >= this.field2179) {
                            var4 = this.field2180 - this.field2179;
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
                        this.field2172 = true;
                    }
                    this.field2179 = (this.field2179 + var4) % 5000;
                    try {
                        if (this.field2180 == this.field2179) {
                            this.field2173.flush();
                        }
                    } catch (IOException var11) {
                        this.field2172 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2181 != null) {
                        this.field2181.close();
                    }
                    if (this.field2173 != null) {
                        this.field2173.close();
                    }
                    if (this.field2175 != null) {
                        this.field2175.close();
                    }
                } catch (IOException var10) {
                }
                this.field2178 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method2262((String) null, var15);
        }
    }
}
