import {useQuery, useQueryClient} from "@tanstack/react-query";
import axios from 'axios';

const Home = () => {
    const {data, error, isLoading} = useQuery(["stocks"], async () => {
        try {
            const response = await axios.get("/getStockBySymbol", {
                params: {
                    stockSymbol: "aapl"
                }
            });
            return response;
        } catch (e) {
            return e;
        }
    });

    if (error) return <div>Request Failed</div>;

    if (isLoading) return <div>Loading...</div>

    console.log("data", data);

    return (
        <div>
            Home
            <p>{data.data.quoteSummary.result[0].financialData.currentPrice.fmt}</p>
        </div>
    )

}

export default Home;