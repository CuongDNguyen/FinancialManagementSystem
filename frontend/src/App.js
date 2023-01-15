import { useQuery, QueryClientProvider, QueryClient } from "@tanstack/react-query";
import Home from "./Home";

const queryClient = new QueryClient()

function App() {
    return (
        <QueryClientProvider client={queryClient}>
            <Home />
        </QueryClientProvider>
  );
}

export default App;
